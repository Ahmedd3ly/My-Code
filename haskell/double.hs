doubleMe :: Int -> Int 
doubleMe x = x + x  

doubleUs :: Int -> Int -> Int
doubleUs x y = ( x + x ) + (y + y)

doubleUs2 :: Int -> Int -> Int
doubleUs2 x y = doubleMe x + doubleMe y

quadrupleMe :: Int -> Int
quadrupleMe x = doubleMe (doubleMe x)
