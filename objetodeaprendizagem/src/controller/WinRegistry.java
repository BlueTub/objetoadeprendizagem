package controller;

import com.sun.jna.platform.win32.Advapi32Util;
import com.sun.jna.platform.win32.WinReg;

/**
 * 
 * @author Hury
 * 
 */

public class WinRegistry {

	/**
	 * // Create a key and write a string
	 */
	public void geraChave() {
		try {
			Advapi32Util.registryCreateKey(WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem");
			Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem", "Linguagem",
					"Portugues");
			Advapi32Util.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem", "Estilo", "Nimbus");
			Advapi32Util
					.registrySetStringValue(WinReg.HKEY_CURRENT_USER,
							"SOFTWARE\\Estrutura de Aprendizagem",
							"TamanhoLetra", "16");
		} catch (Exception e) {
			System.out.println("Erro!, não é possivel inserir!");
		}

	}

	/**
	 * Read a string
	 */
	public void mostraChave() {
		try {
			String valorreg = Advapi32Util.registryGetStringValue(
					WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem", "Linguagem");
			System.out.printf(valorreg + "\n");
			valorreg = Advapi32Util.registryGetStringValue(
					WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem", "Estilo");
			System.out.printf(valorreg + "\n");
			valorreg = Advapi32Util.registryGetStringValue(
					WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem", "TamanhoLetra");
			System.out.printf(valorreg + "\n");
		} catch (Exception e) {
			System.out.println("Não há Registros!");
		}

	}

	/**
	 * Delete a key
	 */
	public void deletaChave() {
		try {
			Advapi32Util.registryDeleteKey(WinReg.HKEY_CURRENT_USER,
					"SOFTWARE\\Estrutura de Aprendizagem");
		} catch (Exception e) {
			System.out.println("Não há Registros!");
		}

	}

	public void versaoWindows() {
		try {
			// Read a string
			String productName = Advapi32Util.registryGetStringValue(
					WinReg.HKEY_LOCAL_MACHINE,
					"SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion",
					"ProductName");
			System.out.printf("Product Name: %s\n", productName);
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readint() {
		// Read an int (& 0xFFFFFFFFL for large unsigned int)
		int timeout = Advapi32Util.registryGetIntValue(
				WinReg.HKEY_LOCAL_MACHINE,
				"SOFTWARE\\Microsoft\\Windows NT\\CurrentVersion\\Windows",
				"ShutdownWarningDialogTimeout");
		System.out.printf(
				"Shutdown Warning Dialog Timeout: %d (%d as unsigned long)\n",
				timeout, timeout & 0xFFFFFFFFL);
	}

}