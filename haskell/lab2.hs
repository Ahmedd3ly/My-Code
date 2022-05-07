--2. Types: Char, Int and Bool

-- a)
checkChar :: Eq char => [char] -> [char] -> Bool
checkChar xs ys = xs == ys 

-- b)
checkCharIndex :: Eq char => [char] -> [char] -> Int -> Bool
checkCharIndex xs ys n = if ((xs /= []) && (ys /= []) )
			 then (xs !! n) == (ys !! n)
			 else False


--what are the most general type:

-- a)

third :: (a,b,c) -> c
third (x,y,z) = z

-- b)
swap :: (a,b) -> (b,a)
swap (x,y) = (y,x)


--Question 4:

-- a)
addsquares :: (Num a) => (a,a) -> a
addsquares(x,y) = x * x + y * y

--b)
ordered :: Eq a => Ord a => a -> a -> a-> Bool
ordered x y z = x<=y && y<=z

--c)
palindrome :: Eq a => [a] -> Bool
palindrome xs = (xs == reverse xs)

--Challenge Task:

-- a)
checkList :: Eq a => [a] -> [a] -> Bool
checkList xs ys = xs == ys 

-- b)
checkListIndex :: Eq a => [a] -> [a] -> Int -> Bool
checkListIndex xs ys n = if ((n < length xs) && (n < length ys))
                         && ((xs /= []) && (ys /= []))
			 then (xs !! n) == (ys !! n)
			 else False





