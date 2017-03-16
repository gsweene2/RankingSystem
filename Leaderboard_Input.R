#install.packages("rvest")
#library(rvest)
leaderboard <- html("https://www.juniorgolfscoreboard.com/smtresultscourse.asp?TID=43404")

leaderboard %>%
  html_nodes("td") %>%
  html_text()

