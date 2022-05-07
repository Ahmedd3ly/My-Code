--Question 1

--(i)

howManyBelowAverage :: Int -> Int -> Int -> Int
howManyBelowAverage x y z = length [ i | i <- [x, y, z], fromIntegral i < avg]
        where avg = average x y z


average :: Int-> Int -> Int -> Float
average x y z = (fromIntegral x + fromIntegral y + fromIntegral z) /3


--(ii)

howManyBelowAverage2 ::Int -> Int-> Int -> Int
howManyBelowAverage2 x y z = if ((fromIntegral x) < avg) || ((fromIntegral y) < avg) || ((fromIntegral z) < avg)
			     then length (filter (<avg) [fromIntegral x, fromIntegral y, fromIntegral z])
			     else 0
	where avg = average x y z
	
	
	
q1Test :: Int -> Int -> Int -> Bool
q1Test x y z = (howManyBelowAverage x y z == howManyBelowAverage2 x y z)

doq1Test :: Bool
doq1Test = q1Test 854260 854264 2000000


--Question 2

pizzaPricing :: Float -> Int -> Int -> Float
pizzaPricing x y z =  fromIntegral (truncate (  ( (pi * (x/2)^2) + (fromIntegral y * 0.001) + (fromIntegral z * 0.50) ) * 1.5 * 10^2 ) ) /10^2

--Question 3

data Direction = North | West | South | East deriving (Show,Eq)

data RelativeDirection = GoForward | GoBack | GoLeft | GoRight deriving Show

--i)



followDirection :: (Int,Int) -> Direction -> (Int,Int)
followDirection (x,y) East = (x+1,y)
followDirection (x,y) North = (x,y+1)
followDirection (x,y) West = (x-1,y)
followDirection (x,y) South = (x,y-1)


--ii)

followDirections :: (Int,Int) -> [Direction] -> (Int,Int)
followDirections (x,y)  [] = (x,y)
followDirections (x,y) (n:ns) = followDirections (followDirection (x,y) n) ns

--iii)

relativizeDirection :: Direction -> Direction -> RelativeDirection
relativizeDirection North North = GoForward
relativizeDirection North East = GoRight
relativizeDirection North West = GoLeft
relativizeDirection North South = GoBack

relativizeDirection East North = GoLeft
relativizeDirection East East = GoForward
relativizeDirection East West = GoBack
relativizeDirection East South = GoRight

relativizeDirection West North = GoRight
relativizeDirection West East = GoBack
relativizeDirection West West = GoForward
relativizeDirection West South = GoLeft

relativizeDirection South North = GoBack
relativizeDirection South East = GoLeft
relativizeDirection South West = GoRight
relativizeDirection South South = GoForward


relativizeDirections :: Direction -> [Direction] -> [RelativeDirection]
relativizeDirections x [] = []
relativizeDirections x (n:ns) = relativizeDirection x n : relativizeDirections n ns

--iv)

sanitizeDirections :: [Direction] -> [Direction]
sanitizeDirections [] = [] 
sanitizeDirections (n:ns)   | n `elem` ns = sanitizeDirections ns
			      | otherwise   = n: sanitizeDirections ns
			      
			      
--Question 4

data Orientation = H | V deriving (Show,Eq)
type Wall = (Int, Int, Orientation)
type Maze = ((Int,Int),[Wall]) 


		
exampleMaze :: Maze
exampleMaze = ((4,4), hWalls ++ vWalls)
	where vWalls = map (\ (i,j) -> (i,j,V))
	               [(0,0),(0,1),(0,2),(0,3),
	                (1,1),(1,2),(2,1),(2,2),
	                (3,2), (3,3),(4,0),(4,1),(4,2)]
	
	      hWalls = map (\ (i,j) -> (i,j,H))[
	                (0,0),(1,0),(2,0),(3,0),
	                      (0,1),(2,1),(2,2),
	                (0,4),(1,4),(2,4),(3,4)]



getDirectionsOut :: Maze -> Maybe [Direction]
getDirectionsOut ((x,y), ws ) = Just (moveThroughMaze ws)
getDirectionsOut ((x,y), [(i,j,k)]) = Nothing


moveThroughMaze :: [Wall] -> [Direction]
moveThroughMaze [(0,0,k)] = [North]
moveThroughMaze [(2,1,k)] = [South]
moveThroughMaze [(0,1,k)] = [East]
moveThroughMaze [(1,0,k)] = [West]
moveThroughMaze (i:j:k) = [East,North,North,North,West,South,South,North,North,East,East,South,North,West,South,South,South,East,East,North,West,East,North,North,East]


	               



			 	
--Question 5

data BTree a = Nil | Node a (BTree a) (BTree a) deriving Show


--i)
complete :: BTree a -> Bool
complete Nil = True
complete (Node x Nil Nil) = True
complete (Node _ lt Nil ) = False
complete (Node x Nil rt ) = False
complete (Node _ (Node _ Nil Nil) Nil) = True
complete (Node x lt  rt ) = (&&) (complete lt) (complete rt)





perfect :: BTree a -> Bool
perfect Nil = True
perfect (Node x Nil Nil) = True
perfect (Node x lt Nil ) = False
perfect (Node x Nil rt ) = False
perfect (Node x lt  rt ) = (&&) (perfect lt) (perfect rt)





			     
			     
			     
			     
