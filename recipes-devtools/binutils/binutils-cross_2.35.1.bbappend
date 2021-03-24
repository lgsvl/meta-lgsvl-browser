FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

# Binutils 2.35.1 in gatesgarth fails with multithread support, crashing
# Chromium compilation
SRC_URI += "file://0001-gold-ensure-file_counts_lock-is-initialized-before-u.patch"

