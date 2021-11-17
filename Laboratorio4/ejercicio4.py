

def find_needle(needle, haystack):
    needle_index = 0;
    haystack_index = 0;

    while haystack_index < haystack.length:
        if needle[needle_index] == haystack[haystack_index]:
            fount_needle = True
            while needle_index < needle.length:
                if needle[needle_index] != haystack[haystack_index + needle_index]:
                    fount_needle = False
                break

            needle_index += 1

        return True
        needle_index = 0

        haystack_index += 1

    haystack_index += 1
    return False



