program max_prime

integer i,j
real(8) P(1000)

do i=1,1000
  P(i) = 0
end do

P(1) = 1

do i = 2,1000
  do j = i*2,1000,+i
    p(j) = 1
  end do
end do

do i = 1,1000
  if (P(i) == 0) then
    max = i
  end if
end do

write (*,*) max

stop
end
