#!/home/ms/.sdkman/candidates/groovy/2.5.7/bin/groovy

Set domains = []

def generator = { String alphabet, int n ->
  new Random().with {
    (1..n).collect { alphabet[ nextInt( alphabet.length() ) ] }.join()
  }
}

500.times{
	domains.add(generator( (('A'..'Z')).join(), 3 ) + ".pl")
}

new File('./domains').withWriter('utf-8') { writer ->
	domains.each{
		writer.writeLine it
	}
}

println "DONE"
