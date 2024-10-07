package disablelogs

import (
	"io"
	"log"
	"os"
)

// Disable logs when the module is imported.
//
// This is necessary because databricks constructs its schema during init time, and
// generates warnings.
//
// These warnings are not seen by TF users, since they print to stderr, which is not shown
// by TF. It is shown by Pulumi.
func init() { log.SetOutput(io.Discard) }

// Undo restores logs to it's original setting.
//
// Calling Undo "undoes" the effect of importing disablelogs.
func Undo() { log.SetOutput(os.Stderr) }
