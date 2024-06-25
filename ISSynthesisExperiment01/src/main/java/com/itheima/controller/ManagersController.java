package com.itheima.controller;

import com.github.pagehelper.PageInfo;
import com.itheima.domain.Manager;
import com.itheima.domain.User;
import com.itheima.service.ManageService;
import com.itheima.utils.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/managers")
public class ManagersController {
    @Autowired
    private ManageService manageService;

    /**
     * 更新管理员密码
     * @return
     */
    @RequestMapping("/update")
    public ApiResponse<Void> updatePassword(@RequestBody Manager manager) {
        int rowsAffected = manageService.updateByAccount(manager.getAccount(), manager.getPassword());
        if (rowsAffected > 0) {
            return new ApiResponse<>(true, "Password updated successfully", null);
        } else {
            return new ApiResponse<>(false, "Manager with account " + manager.getAccount() + " not found", null);
        }
    }

    /**
     * 登录
     * @param m
     * @return
     */
    @RequestMapping("/login")
    public ApiResponse<Manager> login(@RequestBody Manager m) {
        Manager manager = manageService.findByAccount(m.getAccount(), m.getPassword());
        if (manager != null) {
            return new ApiResponse<>(true, "Success", manager);
        } else {
            return new ApiResponse<>(false, "Manager not found", null);
        }
    }

   @RequestMapping("/mlogin")
   public String getAll(Model model){
       List<Manager> managerList = manageService.getAll();
       model.addAttribute("managerList",managerList);
       System.out.println(managerList);
       return "manager_login";
   }
    @RequestMapping(value = "/getManagers", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public List<Manager> getManagers() {
        return manageService.getAll();
    }
    /**
     * 分页获取管理员
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping
    public ApiResponse<PageInfo<Manager>> findAll(@RequestParam(defaultValue = "1") int pageNum, @RequestParam(defaultValue = "10") int pageSize) {
        PageInfo<Manager> pageInfo = manageService.findAll(pageNum, pageSize);
        return new ApiResponse<>(true, "Success", pageInfo);
    }
}
