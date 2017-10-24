require chromium-x11.inc

SRC_URI[md5sum] = "9fe9af85faeaf617cb61997c431a02e2"
SRC_URI[sha256sum] = "0bfb6318af1c3cf82e8ac872e3da34cd3c013aadaab446d5097228101cec065e"

LIC_FILES_CHKSUM += "\
  file://${S}/ios/third_party/requirejs/LICENSE;md5=6c5c3cca8d53e6a11dd78c7376b6ec9c \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=09ddf4f14717898086b11c57b94dcd95 \
  file://${S}/third_party/libsrtp/LICENSE;md5=15bc16b9d2e305974dde47e733883714 \
"

SRC_URI += " \
 file://0001-WebrtcAudioPrivateSetAudioExperimentsFunction-dummy-.patch \
"