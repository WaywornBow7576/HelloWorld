package waywornbow.novel;

//todo: put appropriate imports here

class character{
  String name;
  map<String, String> images;
  
  public character(String name){
    this.name = name;
  }
  
  public void addImage(String emotion, String image){
    this.images.put(emotion, image);
  }
  
  public String getImage(String emotion){
    return this.images.get(emotion);
  }
  //todo: write getter for name
}
