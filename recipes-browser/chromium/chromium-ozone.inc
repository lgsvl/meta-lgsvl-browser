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
 use_custom_libcxx = false \
 use_xkbcommon=true \
 use_jumbo_build = true \
 closure_compile = false \
"
