require chromium-upstream-tarball.inc

PV = "80.0.3987.42"

SRC_URI[md5sum] = "dfeccd636d21acdbc9f57d16a094b280"
SRC_URI[sha256sum] = "160c02ed00d45a074246c8984144a35b092102e9b9a31e2bc9c2dad49f297945"

LIC_FILES_CHKSUM += "\
  file://${S}/base/third_party/double_conversion/LICENSE;md5=1ea35644f0ec0d9767897115667e901f \
  file://${S}/buildtools/third_party/libc++/trunk/LICENSE.TXT;md5=55d89dd7eec8d3b4204b680e27da3953 \
  file://${S}/buildtools/third_party/libc++abi/trunk/LICENSE.TXT;md5=7b9334635b542c56868400a46b272b1e \
  file://${S}/third_party/SPIRV-Tools/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/angle/LICENSE;md5=7abdb66a6948f39c2f469140db5184e2 \
  file://${S}/third_party/blink/LICENSE_FOR_ABOUT_CREDITS;md5=11e90d553b211de885f245900c4ccf89 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=9b082148f9953258347788edb83e401b \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/chromevox/LICENSE;md5=45739090b454125d851ac7bb1bbd23a2 \
  file://${S}/third_party/d3/src/LICENSE;md5=0679931d76eb2f1dd1915249da84a722 \
  file://${S}/third_party/expat/src/expat/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=5af3cfcd2117a0fe5d3b2f7b488c4b3b \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=e11f5c3149cdec4bb309babb020b32b9 \
  file://${S}/third_party/icu/LICENSE;md5=8bc5d32052a96f214cbdd1e53dfc935d \
  file://${S}/third_party/libjpeg_turbo/LICENSE.md;md5=f568c3bdd0195918f507100b71862ee5 \
  file://${S}/third_party/libpng/LICENSE;md5=b0085051bf265bac2bfc38bc89f50000 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/pdfium/LICENSE;md5=efe815679251504905d0f2c88a77c886 \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/skia/LICENSE;md5=822f02cc7736281816581cd064afbb1c \
  file://${S}/third_party/wtl/Ms-PL.txt;md5=1d2c3cdd7e748a6bc4213321d9157c5a \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/v8/LICENSE;md5=6611673a9587a522034a4be8f4df564c \
"

SRC_URI += " \
 file://0001-Wrap-several-native-binary-calls-on-Yocto-building-w.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-Fix-gcc-compilation-error.patch;patchdir=net/third_party/quiche/src \
 file://0001-Add-missing-algorithm-header-in-bitmap_cursor_factor.patch \
 file://0001-GCC-media_log_properties_helper-fix.patch \
 file://0001-cros-search-service-Include-cmath-for-std-pow.patch \
 file://0001-BookmarkModelMerger-Move-RemoteTreeNode-declaration-.patch \
 file://0001-GCC-workaround-error-resolving-IsA-template-in-Delet.patch \
 file://0001-GCC-do-not-instantiate-CrossThreadCopier-template-fo.patch \
 file://0001-GCC-fix-clash-of-struct-xdg_surface-with-getter-xdg_.patch \
"
