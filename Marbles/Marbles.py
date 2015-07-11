MOD_VALUE = 10 ** 9 + 7

def get_counts(b,exp,m):
	val = 1
	while exp:
		if exp%2:
			val*=b
			val%=m
		b*=b
		b%=m
		exp=int(exp/2)
	return val

for tc in range(int(input())):
	print(get_counts(2, int(input()) -1, MOD_VALUE))