require gn.inc

S = "${WORKDIR}/src"

SRC_URI = "https://tmp.igalia.com/chromium-tarballs/chromium-wayland-8eb8619a.tar.xz"
SRC_URI += "file://0001-Add-missing-deps.patch"

SRC_URI[md5sum] = "2a83227fcdb52b162014384e6550e8cb"
SRC_URI[sha256sum] = "1f394b48dc5f3815d051f7af724873ff0785086578aadc0d8d4395e10217be27"
