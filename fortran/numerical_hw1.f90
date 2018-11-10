program matrix

integer i,j
real H(10,10),max,newmax

do i=1,10
	do j=1,10
		H(i,j) = cos(i*0.7+ j + 2)/(i+j-1)
	end do
end do

newmax = 0

do j=1,10
	max = 0
	do i=1,10
		max = max + H(i,j)
	end do
	if (newmax<=max) then
		newmax = max
	end if
end do

write (*,*) "Maximum column sum :",newmax

stop
end
