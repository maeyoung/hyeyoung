import time

startTime = time.clock()

numbers = range(100000000)
sum = 0

for number in numbers:
   sum = sum + number

endTime = time.clock()

print ("합: " + str(sum))
print ("시간: " + str(endTime - startTime) + "초")