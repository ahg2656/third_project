'''
Created on 2018. 11. 1.

@author: kitcoop
'''
"""
여러 줄 주석
"""
# 한줄 주석

v1 = '안녕 파이선'   # 전부 객체(instance)이기 때문에 타입 무관
v1 = 5  # 덮어쓰기

print(v1)   # 들여쓰기는 { } 와 같음

v2 = 20.5   
v3 = v2     # 객체의 주소를 기억 

print(v1, v2, v3)

print(id(v1), id(v2), id(v3))   # id() : 주소값 반환

print(v1 is v2, v1 == v2)   # is 는 주소를 == 는 값을 비교
print(v2 is v3, v2 == v3)

print() 

print(1000 is 10 ** 3)
print(1000 == 10 ** 3)

print(1000, id(1000))
print(10 ** 3, id(10 ** 3))

print()

A = 1; a = 2    # 한 줄에 두 개의 입력이 있으면 ; 으로 구분
print(A, a, id(A), id(a))   # 대소문자 구분
# 기본형이 존재하지 않고 주소를 참고하는 참조형만이 존재

import keyword
print("키워드 목록 : \n", keyword.kwlist)
"""
['False', 'None', 'True', 'and', 'as', 'assert', 'async', 'await', 'break', 'class', 'continue', 
'def', 'del', 'elif', 'else', 'except', 'finally', 'for', 'from', 'global', 'if', 'import', 'in', 
'is', 'lambda', 'nonlocal', 'not', 'or', 'pass', 'raise', 'return', 'try', 'while', 'with', 'yield']
"""

print()

print(10, oct(10), hex(10), bin(10)) # 10진수, 8진수, 16진수, 2진수
print(10, 0o12, 0xa, 0b1010)

print()

print('type(자료형)')  # 파이썬은 모두 클래스
print(3, type(3))
print(3.5, type(3.5))
print(3 + 4j, type(3 + 4j)) # 복소수(complex)
print(True, type(True))
print('abc', type('abc'))   # 문자열(str)

print((1,), type((1,)))
print([1], type([1]))
print({1}, type({1}))
print({'key':1}, type({'key':1}))

print()

print(isinstance(a, int))   # instance(객체)의 타입을 확인
print(isinstance(a, float))















