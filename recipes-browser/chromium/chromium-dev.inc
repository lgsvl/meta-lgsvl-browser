require chromium-upstream-tarball.inc

PV = "85.0.4168.2"

SRC_URI[md5sum] = "764a37e40cabae3cb7ea7be3b25db055"
SRC_URI[sha256sum] = "1a7a7b42639ef1e8d4740454ca198e24615d1c5ff82fec4baeb0f62abfff359b"

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
  file://${S}/third_party/expat/src/expat/COPYING;md5=9e2ce3b3c4c0f2670883a23bbd7c37a9 \
  file://${S}/third_party/ffmpeg/CREDITS.chromium;md5=28c3eb351f68aa1d038e0e299dad5637 \
  file://${S}/third_party/freetype/src/docs/FTL.TXT;md5=9f37b4e6afa3fef9dba8932b16bd3f97 \
  file://${S}/third_party/google_toolbox_for_mac/LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
  file://${S}/third_party/harfbuzz-ng/src/COPYING;md5=8f787620b7d3866d9552fd1924c07572 \
  file://${S}/third_party/icu/LICENSE;md5=a3808a5b70071b07f87ff2205e4d75a0 \
  file://${S}/third_party/libjpeg_turbo/LICENSE.md;md5=f568c3bdd0195918f507100b71862ee5 \
  file://${S}/third_party/libpng/LICENSE;md5=b0085051bf265bac2bfc38bc89f50000 \
  file://${S}/third_party/libsrtp/LICENSE;md5=2909fcf6f09ffff8430463d91c08c4e1\
  file://${S}/third_party/ots/LICENSE;md5=e06eff2aa65b917034a81599bea73dc4 \
  file://${S}/third_party/pdfium/LICENSE;md5=efe815679251504905d0f2c88a77c886 \
  file://${S}/third_party/protobuf/LICENSE;md5=37b5762e07f0af8c74ce80a8bda4266b \
  file://${S}/third_party/shaderc/src/LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
  file://${S}/third_party/skia/LICENSE;md5=822f02cc7736281816581cd064afbb1c \
  file://${S}/third_party/wtl/Ms-PL.txt;md5=1d2c3cdd7e748a6bc4213321d9157c5a \
  file://${S}/v8/LICENSE;md5=6611673a9587a522034a4be8f4df564c \
"

SRC_URI += " \
  file://0001-Do-not-use-__has_builtin-directly-as-it-breaks-GCC-b.patch;patchdir=third_party/ffmpeg \
  file://0001-cros-search-service-Add-missing-include-cmath.patch \
  file://0001-IWYU-include-cmath-for-using-std-sqrt-in-federated_l.patch \
  file://0001-DO-NOT-COMMIT-Disable-atk-assert-if-toolchain-is-not.patch \
  file://0001-IWYU-include-memory-in-ManagementService.patch \
  file://0001-GCC-missing-calling-CBBFunctionToVector-in-Ed25519Pr.patch \
  file://0001-bluetooth-fix-compile-error-in-dbus-fake-bluetooth-d.patch \
  file://0001-IWYU-include-bitset-in-VP9ReferenceFrameVector.patch \
  file://0001-IWYU-include-cstring-for-memset-and-memcpy-calls-in-.patch \
  file://0001-IWYU-opencv-include-algorithm-and-cstring-in-emd.cpp.patch \
  file://0001-GCC-avoid-clash-between-generated-type-x11-RandR-Con.patch \
  file://0001-x11-Connection-Undefine-max-and-min-after-including-.patch \
  file://0001-Add-missing-cstring-include-and-namespace-in-WebStri.patch \
  file://0001-Do-not-use-NearbyConnection-as-parameter-passed-by-c.patch \
  file://0001-GCC-do-not-use-DCHECK_EQ-NE-for-checking-PageNode-Op.patch \
  file://0001-Add-include-to-fix-compilation-in-some-cases.patch \
  file://0001-GCC-remove-noexcept-declaration-in-CrossVariantMojoA.patch \
  file://0001-GCC-Fix-DHECK_EQ.patch \
"

do_install_append() {
        install -m 0755 crashpad_handler ${D}${libdir}/chromium/crashpad_handler
}

# Crashpad uses zlib internally, but it still does not handle properly the
# NEON codepath for GCC.
GN_ARGS_append_armv7ve += 'arm_use_neon=false'
