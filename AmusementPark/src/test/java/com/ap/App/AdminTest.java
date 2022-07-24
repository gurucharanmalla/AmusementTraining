package com.ap.App;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import com.ap.App.Entity.Admin;
import com.ap.App.service.AdminServiceImpl;

@SpringBootTest
class AdminTest {
	@Mock
	AdminServiceImpl adminService;

	@Test
	void inssertAdminTest() {
		Admin admin=new Admin();
		when(adminService.insertAdmin(admin)).thenReturn(admin);
		assertEquals(admin, adminService.insertAdmin(admin));
	}
	@Test
	void deleteAdminTest() {
		Admin admin=new Admin();
		admin.setAdminId(123);
		when(adminService.deleteAdmin(123)).thenReturn(admin);
		assertEquals("", adminService.deleteAdmin(123));
	}
	
	@Test
	void viewAdmin()
	{
		Admin admin1 = new Admin();
		admin1.setAdminId(123);
		when(adminService.viewAdmin(123)).thenReturn(admin1);
		assertEquals(admin1, adminService.viewAdmin(123));
	}
}
