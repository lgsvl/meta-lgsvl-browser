require chromium-upstream-tarball.inc

PV = "79.0.3945.117"

SRC_URI[md5sum] = "42133640697fe46776512c880a9b28b0"
SRC_URI[sha256sum] = "4d960e8bd790cc1c8e7f0632790424957c4996a8a91b9d899eb572acec854ef1"

LIC_FILES_CHKSUM += "\
  file://${S}/base/third_party/double_conversion/LICENSE;md5=1ea35644f0ec0d9767897115667e901f \
  file://${S}/buildtools/third_party/libc++/trunk/LICENSE.TXT;md5=55d89dd7eec8d3b4204b680e27da3953 \
  file://${S}/buildtools/third_party/libc++abi/trunk/LICENSE.TXT;md5=7b9334635b542c56868400a46b272b1e \
  file://${S}/third_party/SPIRV-Tools/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/angle/LICENSE;md5=7abdb66a6948f39c2f469140db5184e2 \
  file://${S}/third_party/blink/LICENSE_FOR_ABOUT_CREDITS;md5=11e90d553b211de885f245900c4ccf89 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=e91719b7727a2d3464ec006154275572 \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/chromevox/LICENSE;md5=45739090b454125d851ac7bb1bbd23a2 \
  file://${S}/third_party/d3/src/LICENSE;md5=0679931d76eb2f1dd1915249da84a722 \
  file://${S}/third_party/errorprone/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/expat/src/expat/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=f74504a10e06dc175c0e8e7e15105c05 \
  file://${S}/third_party/flot/LICENSE.txt;md5=fe1ea2158d814e4fc7227c8c6ccd7ab3 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=e11f5c3149cdec4bb309babb020b32b9 \
  file://${S}/third_party/icu/LICENSE;md5=8bc5d32052a96f214cbdd1e53dfc935d \
  file://${S}/third_party/libjpeg_turbo/LICENSE.md;md5=f568c3bdd0195918f507100b71862ee5 \
  file://${S}/third_party/libpng/LICENSE;md5=b0085051bf265bac2bfc38bc89f50000 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/pdfium/LICENSE;md5=defd64fe3646eb60a5d01fcbcc8b6b7c \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/skia/LICENSE;md5=d25bb58a1be2e1af9b58d31565a206dc \
  file://${S}/third_party/wtl/Ms-PL.txt;md5=1d2c3cdd7e748a6bc4213321d9157c5a \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
  file://${S}/v8/LICENSE;md5=6611673a9587a522034a4be8f4df564c \
"

SRC_URI += " \
 file://0001-Wrap-several-native-binary-calls-on-Yocto-building-w.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-IWYU-using-CHAR_BIT-in-encryption-utils-requires-inc.patch \
 file://0001-IWYU-include-algorithm-to-use-std-lower_bound-in-ui-.patch \
 file://0001-Reland-GCC-Fix-base-internal-InvokeFuncImpl.patch \
 file://0001-GCC-use-brace-initializer-for-DohUpgrade-vector.patch \
 file://0001-IWYU-missing-algorithm-include-in-Ozone-bitmap-curso.patch \
 file://0001-GCC-avoid-clash-of-WebThemeEngine-ForcedColors-with-.patch \
 file://0001-IWYU-launch_manager.h-uses-std-vector.patch \
"
