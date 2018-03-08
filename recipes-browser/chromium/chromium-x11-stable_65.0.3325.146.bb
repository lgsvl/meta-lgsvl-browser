require chromium-x11.inc

SRC_URI[md5sum] = "16770a0fb204e39135f78c3c67b911f5"
SRC_URI[sha256sum] = "cb4f2f3f5a3344f7c452b61f8086d4b4e56af6f5bc34309c3ede8be6b4ab81a3"

LIC_FILES_CHKSUM += "\
  file://${S}/third_party/boringssl/src/LICENSE;md5=4b1ad67f3a4b5a2346e6616c1268b0fb \
  file://${S}/third_party/breakpad/LICENSE;md5=828152b41153892a725f0e7f56faff73 \
  file://${S}/third_party/expat/files/COPYING;md5=5b8620d98e49772d95fc1d291c26aa79 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=fc70a2842a197fbb05a1fd3a90b47148 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/icu/LICENSE;md5=675f2d069434d8a1e4e6b0dcf4379226 \
  file://${S}/third_party/libpng/LICENSE;md5=c2adba923425f511c6087a7ca53270e6 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/yasm/source/patched-yasm/COPYING;md5=a12d8903508fb6bfd49d8d82c6170dd9 \
"

SRC_URI += " \
 file://v8-6.4.336-qemu-wrapper.patch;patchdir=v8 \
 file://0001-Use-v8-qemu-wrapper.sh-on-v8-context-snapshot-creati.patch \
 file://0001-Workaround-for-g-7-is_trivially_copy_constructible-f.patch \
 file://0001-GCC-build-fix-base-Optional-T-requires-the-full-decl.patch \
 file://0001-wtf-oilpan-Remove-GC-checks-from-WTF-Optional-T.patch \
 file://0001-GCC-build-fix-mark-is_trivially_copy_constructible-f.patch \
 file://0001-Fix-non-copyable-class-s-optional-move.patch \
 file://0001-Use-affirmative-expression-in-base-Optional.patch \
 file://0001-Implement-conditional-copy-move-ctors-assign-operato.patch \
 file://0001-Implement-converting-constructors-from-Optional-U.patch \
 file://0001-Implement-value-forward-constructor.patch \
 file://0001-Update-non-copy-non-move-assign-operators.patch \
 file://0001-GCC-PlaybackImageProvider-Settings-do-not-provide-co.patch \
 file://0001-GCC-explicitely-std-move-to-base-Optional-instead-of.patch \
 file://0001-GCC-IDB-methods-String-renamed-to-GetString.patch \
 file://0001-GCC-fully-declare-ConfigurationPolicyProvider.patch \
 file://0001-Fix-build-with-glibc-2.27.patch \
"
