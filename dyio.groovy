DyIO d=null;// Create a variable to store the device
//Check if the device already exists in the device Manager
if(DeviceManager.getSpecificDevice(DyIO.class, "dyio")==null){
	//If the device does not exist, prompt for the connection
	d = new DyIO(ConnectionDialog.promptConnection()); // This is the DyIO to talk to.
	d.connect(); // Connect to it.
	// add the device to the maager
	DeviceManager.addConnection(d,"dyio");
}else{
	//the device is already present on the system, load the one that exists.
  d=(DyIO)DeviceManager.getSpecificDevice(DyIO.class, "dyio")
}

//Devices are passed to scripts using the name displayed in the connections tab
println(d)


