SUMMARY = "Meta-build system from Google"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0fca02217a5d49a14dfe2d11837bb34d"

DEPENDS = "python-native ninja-native"

SRC_URI = "http://gsdview.appspot.com/chromium-browser-official/chromium-${PV}.tar.xz"

S ?= "${WORKDIR}/chromium-${PV}"

do_compile () {
  cd ${S}/tools/gn
  ./bootstrap/bootstrap.py -s
}

do_install () {
  install -d ${D}${bindir}
  install -m 0755 out/Release/gn ${D}${bindir}/gn
}

BBCLASSEXTEND = "native nativesdk"
