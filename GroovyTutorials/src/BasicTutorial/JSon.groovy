package BasicTutorial

import groovy.json.JsonSlurper
import groovy.json.JsonOutput

class Json {
	static void main(String[] args) {
		def jsonSlurper = new JsonSlurper()
		def object = jsonSlurper.parseText('{ "name": "John", "ID" : "1"}')

		println(object.name);
		println(object.ID);

		def output = JsonOutput.toJson([
			new Studentt(name: 'John',ID:1),
			new Studentt(name: 'Mark',ID:2)
		])
		println(output);
	}
}

class Studentt {
	String name
	int ID;
 }
