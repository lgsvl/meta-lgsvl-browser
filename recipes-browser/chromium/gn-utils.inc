def gn_arch_name(yocto_arch):
    """Translates between Yocto's architecture values and the corresponding
    ones used by GN."""
    translation_table = {
        'aarch64': 'arm64',
        'arm': 'arm',
        'i586': 'x86',
        'x86_64': 'x64',
    }
    try:
        return translation_table[yocto_arch]
    except KeyError:
        bb.msg.fatal('"%s" is not a supported architecture.' % yocto_arch)
