SUMMARY = "PRU toolchain target"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

ALLOW_EMPTY_${PN} = "1"
PACKAGES = "${PN}"

RDEPENDS_${PN} += " \
               prussdrv-staticdev \
"
