package BasicTutorial

class Maps {

	static void main(String[]args){
	
		def mp = ["TopicName" : "Maps", "TopicDescription" : "Methods in Maps"];
		println(mp.containsKey("TopicName"));
		println(mp.containsKey("Topic"));
		
		println(mp.get("TopicDescription"));
		println(mp.keySet());
		
		mp.put("TopicID","1");
		println(mp)
	}
}
