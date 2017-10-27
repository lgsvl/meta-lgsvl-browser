require chromium-lge.inc

SRC_URI[md5sum] = "cd320716d6595a77f480f38b5dbbcc07"
SRC_URI[sha256sum] = "b7fe59a1a3a5cda79afca819a1ae3096834307ce017f19a2d3c652af8d23b9d7"

LIC_FILES_CHKSUM += "\
  file://${S}/ios/third_party/requirejs/LICENSE;md5=6c5c3cca8d53e6a11dd78c7376b6ec9c \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=09ddf4f14717898086b11c57b94dcd95 \
  file://${S}/third_party/libsrtp/LICENSE;md5=15bc16b9d2e305974dde47e733883714 \
  file://${S}/third_party/libva/COPYING;md5=2e48940f94acb0af582e5ef03537800f \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=26c9f3d11f88911950f9ff62189d3d4f \
"

SRC_URI += " \
 file://0001-WebrtcAudioPrivateSetAudioExperimentsFunction-dummy-.patch \
"
