
song = 'cold, cold heart'
replaced_song = song.replace('o', 'e')

# The original string is unchanged
print('Original string:', song)

print('Replaced string:', replaced_song)

song = 'let it be, let it be, let it be'

# maximum of 0 substring is replaced
# returns copy of the original string
print(song.replace('let', 'so', 0))