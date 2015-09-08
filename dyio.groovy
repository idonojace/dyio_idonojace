DyIO d=null;
if(DeviceManager.getSpecificDevice(DyIO.class, "dyio")==null){
	d = new DyIO(ConnectionDialog.promptConnection()); // This is the DyIO to talk to.
	d.connect(); // Connect to it.
	DeviceManager.addConnection(d,"dyio");
}else{
  d=(DyIO)DeviceManager.getSpecificDevice(DyIO.class, "dyio")
}

//Devices are passed to scripts using the name displayed in the connections tab
println(dyio)


