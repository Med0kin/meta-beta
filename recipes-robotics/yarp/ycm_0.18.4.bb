SUMMARY = "YCM - YARP CMake Modules"
DESCRIPTION = "Extra CMake modules for YARP and friends"
HOMEPAGE = "https://github.com/robotology/ycm"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=25ac550c31901bd839c424de413914c9"

SRC_URI = "git://github.com/robotology/ycm.git;protocol=https;nobranch=1"
SRCREV = "v${PV}"

S = "${WORKDIR}/git"

inherit cmake

ALLOW_EMPTY:${PN} = "1"

FILES:${PN}-dev = " \
    ${datadir}/cmake/YCM/* \
    ${datadir}/YCM/* \
"

BBCLASSEXTEND = "native nativesdk"
