package diverse

describe "Tables"{

  def additions{
  		|  a  |  b  |  sum  |
  		|  1  |  2  |   3   |
  		|  4  |  5  |   9   |
  		| 10  | 11  |  21   | 
  		| 21  | 21  |  42   | 
  }
  
  fact additions.forEach[ a + b => sum ]
  
}