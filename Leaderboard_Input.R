#install.packages("rvest")
#library(rvest)
leaderboard <- html("https://www.juniorgolfscoreboard.com/smtresultscourse.asp?TID=43404")

leaderboard %>%
  html_nodes("table") %>%
  html_text()

fullTableData <- leaderboard %>%
  html_nodes("td") %>%
  html_text()

fullTableData2 <- fullTableData[15:715]

Leaderboard = as.data.frame(matrix(result,ncol=2,byrow=TRUE))
