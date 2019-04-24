require chromium-gn.inc

DEPENDS += "\
    gtk+3 \
    libx11 \
    libxcomposite \
    libxcursor \
    libxdamage \
    libxext \
    libxfixes \
    libxi \
    libxrandr \
    libxrender \
    libxscrnsaver \
    libxtst \
"

GN_ARGS += "\
 closure_compile = false \
 use_custom_libcxx = false \
 use_jumbo_build = true \
"
