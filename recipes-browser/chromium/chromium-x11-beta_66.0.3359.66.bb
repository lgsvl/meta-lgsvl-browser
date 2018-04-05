require chromium-x11.inc

SRC_URI[md5sum] = "8ac49bec8e93d4cfa51c22839f42f851"
SRC_URI[sha256sum] = "73bfa25d41c432ba5a542b20043b62118bc8451bb9e031edc7394cc65d6b5d64"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/angle/LICENSE;md5=10305d79487367a5e938772c27246ac1 \
  file://${S}/third_party/boringssl/src/LICENSE;md5=63fc48094a8843e39d999e30954b7773 \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=c196fd5595d5ee48c87e2793f8a76cd6 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/COPYING;md5=e021dd6dda6ff1e6b1044002fc662b9b \
  file://${S}/third_party/icu/LICENSE;md5=675f2d069434d8a1e4e6b0dcf4379226 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://v8-6.4.336-qemu-wrapper.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-GCC-build-fix-base-Optional-T-requires-the-full-decl.patch \
 file://0001-GCC-PlaybackImageProvider-Settings-do-not-provide-co.patch \
 file://0001-GCC-build-fix-mark-is_trivially_copy_constructible-f.patch \
 file://0001-GCC-IDB-methods-String-renamed-to-GetString.patch \
 file://0001-GCC-do-not-initialize-NEON-int32x4_t-with-braces-ini.patch \
 file://0001-jumbo-Fix-extensions-common-jumbo-build.patch \
 file://0001-GCC-return-to-optionals-with-std-move.patch \
 file://0001-GCC-do-not-use-initializer-list-for-NoDestructor-of-.patch \
"
