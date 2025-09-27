# Install Pulumi and plugins required at build time.
install_plugins: .make/install_plugins
.make/install_plugins: export PULUMI_HOME := $(WORKING_DIR)/.pulumi
.make/install_plugins:
	pulumi plugin install converter terraform 1.0.16
	pulumi plugin install resource random 4.8.2
	pulumi plugin install resource aws 6.31.0
	pulumi plugin install resource time 0.0.13
	pulumi plugin install resource azure 5.66.1
	pulumi plugin install resource docker 4.5.1
	pulumi plugin install resource std 1.6.2
	@touch $@
.PHONY: install_plugins
