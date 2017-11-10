SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-wayland-8eb8619a.tar.xz;destsuffix=chromium-${PV}"

S = "${WORKDIR}/src"

require chromium-ozone-igalia.inc

SRC_URI[md5sum] = "2a83227fcdb52b162014384e6550e8cb"
SRC_URI[sha256sum] = "1f394b48dc5f3815d051f7af724873ff0785086578aadc0d8d4395e10217be27"

LIC_FILES_CHKSUM += "\
  file://${S}/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=9c3ee559c6f9dcee1043ead112139f4f \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=3adeb0fd8df4d2f0d81a7e4db49e4a37 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=740fe57c4bba4c18b3a3bafd39cb70f8 \
  file://${S}/third_party/libpng/LICENSE;md5=b3edd1241cafd9e736d04c08d5017ff4 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=c2c05f9bdd5fc0b458037c2d1fb8d95e \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"
