'''
집합형 자료 : str - 문자 묶음 (순서 O, 값변경 X)
'''

s = 'sequence'
print(len(s), s.count('e'))     # len() : 문자열의 길이    / s.count('e') : s 에 e 포함 횟수

print(s.find('e'), s.find('e', 3), s.rfind('e'))    # find() : 해당 문자의 위치값 반환

print(s.startswith('s'))    # startswith() : 해당 문자로 시작하는지 여부 반환

print()

ss = 'mbc'
aa = 'mbc'
print('mbc', id(ss), id(aa), id('mbc'))
ss = 'abc'  # 새로운 객체의 주소로 치환
print(ss, id(ss))

print('슬라이싱(집합형 자료의 일부를 참조)')

print(s)
print(s[0], s[2:4], s[:3], s[3:])   # str[n:m] : n번째에서 m-1번째
print(s[-1], s[-4:-1], s[-3:])  # 뒤에서부터 
print(s[::])    # = print(s)
print(s[::2])   # 하나 걸러 하나, 간격, step

# s[1] = 'p'    # 참조는 가능하지만 일부 값변경 불가

sss = ' kbs mbc'
print(sss)
print(sss.strip())  # strip() : 문자열 앞뒤 공백 제거
print(sss.lstrip(), sss.rstrip())   # 왼, 오

s4 = sss.split(sep=' ') # split(sep='') : 문자열 자르기
print(s4)
print(':'.join(s4)) # join() : 문자열 합치기

print()
a = 'life is too short'
b = a.replace('life', 'Your leg')   # replace() : 치환

print(b)
 








