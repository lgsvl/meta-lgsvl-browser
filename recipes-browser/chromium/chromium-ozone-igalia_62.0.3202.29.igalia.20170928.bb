SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-wayland-8eb8619a.tar.xz;destsuffix=chromium-${PV}"

S = "${WORKDIR}/src"

require chromium-ozone-igalia.inc

SRC_URI[md5sum] = "2a83227fcdb52b162014384e6550e8cb"
SRC_URI[sha256sum] = "1f394b48dc5f3815d051f7af724873ff0785086578aadc0d8d4395e10217be27"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"
