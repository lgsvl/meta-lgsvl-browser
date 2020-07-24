require chromium-gn.inc

DEPENDS += "\
 gtk+3 \
 ${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'virtual/egl wayland libxkbcommon', '', d)} \
 ${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'libx11 libxcomposite libxcursor libxdamage libxext libxfixes libxi libxrandr libxrender libxscrnsaver libxtst', '', d)} \
"

GN_ARGS += "\
 use_ozone=true \
 ozone_auto_platforms=false \
 ozone_platform_headless=true \
 ozone_platform_wayland=${@bb.utils.contains('DISTRO_FEATURES', 'wayland', 'true', 'false', d)} \
 ozone_platform_x11=${@bb.utils.contains('DISTRO_FEATURES', 'x11', 'true', 'false', d)} \
 use_system_libwayland=true \
 use_system_minigbm=true \
 use_system_libdrm=true \
 use_xkbcommon=true \
"

# Right now GBM buffers are not working properly on v3d driver used in RPI4
GN_ARGS_append_raspberrypi4 = " use_wayland_gbm=false"
GN_ARGS_append_raspberrypi4-64 = " use_wayland_gbm=false"
