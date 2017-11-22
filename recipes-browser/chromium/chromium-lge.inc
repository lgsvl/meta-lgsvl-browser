require chromium-lgsvl-tarball.inc
require chromium-gn.inc

DEPENDS += " \
 libxkbcommon \
 virtual/egl \
 wayland \
"

GN_ARGS += "\
 use_ozone=true \
 ozone_auto_platforms=false \
 ozone_platform_wayland_external=true \
 use_xkbcommon=true \
"
