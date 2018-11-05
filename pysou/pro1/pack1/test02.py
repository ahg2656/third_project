'''
연산자
'''

v1 = 3
v1 = v2 = v3 = 5
print(v1, v2, v3)
print('파이썬', end=', ')    # print 는 기본적으로 줄바꿈 -> end 를 통해 구분자 변경 가능
print('만세')

v1 = 1, 2, 3
print(v1, type(v1))

v2, v3 = 10, 20
v3, v2 = v2, v3     # 두 변수의 값 변경
print(v2, v3)

print('packing')    # 값 할당
*v1, v2 = [1,2,3,4,5]   # * : packing 연산
# v1, *2 = [1,2,3,4,5]
print(v1)
print(v2)

print()
v1, *v2, v3 = [1,2,3,4,5]   # * 은 동시에 두 곳은 안됨
print(v1, v2 ,v3)

# http://cafe.daum.net/flowlife/RUrO/50
print(format(1.5678, '10.3f'))  # 10자리 + 소수 이하 3자리 (반올림)
print('나는 나이가 %d 이다.'%23)
print('나는 나이가 %s 이다.'%'스물셋')
print('나는 나이가 %d 이고 이름은 %s이다.'%(23, '홍길동'))
print('나는 나이가 %s 이고 이름은 %s이다.'%(23, '홍길동'))
print('나는 키가 %f이고, 에너지가 %d%%.'%(177.7, 100))
print('이름은 {0}, 나이는 {1}'.format('한국인', 33))
print('이름은 {}, 나이는 {}'.format('신선해', 33))
print('이름은 {1}, 나이는 {0}'.format(34, '강나루')) 

print("\n\n연산자 연습")
print(5 + 3, 5 - 3, 5 * 3, 5 / 3)
print(5 // 3, 5 % 3, divmod(5, 3))  # divmod() : 몫과 나머지를 같이 출력

print(3 + 4 * 5, (3 + 4 * 5))

print(5 > 3 and 4 < 3, 5 >= 3 or 4 <= 3, not(3 > 2))

print()
print('한' + '국' + '만세')
print('한국' * 20)    # 문자열 곱하기 존재 (더하기의 연속)

print()
a = 10
a = a + 1
a += 1
# a++/a-- : 증감연산자 없음
print(a)

print('부호 변경 : ', a, a * -1, -a, --a)   # --a : 부호를 두 번 바꿈 (원래대로)

print('boolean : ', bool(0), bool(0.0), bool(1), bool(10), bool(-1.1))     # 0(0.0) 이외의 숫자는 True

print('boolean : ', bool(False), bool(None), bool(""), bool([]), bool({}))  # 모두 False

print("참고")
print(r"c:\aa\bb\table")     # r"" : 문자열 안에 있는 문자들을 순수 문자로 인식







