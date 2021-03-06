package com.dat.carparking.dao;

import java.util.Date;
import java.util.List;

import com.dat.carparking.model.Admin;
import com.dat.carparking.model.History;
import com.dat.carparking.model.Location;

public interface LocationDao {
	 void persistRecord(Location location);
	 public List<History> listRecords(Date parked_date);
	 void deleteRecord(History history);
	 public Admin login(String admin_name, String admin_password);
}

