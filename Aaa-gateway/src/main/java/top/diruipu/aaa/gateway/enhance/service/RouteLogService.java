package top.diruipu.aaa.gateway.enhance.service;


import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import top.diruipu.aaa.common.core.entity.QueryRequest;
import top.diruipu.aaa.gateway.enhance.entity.RouteLog;

/**
 * @author zrp
 */
public interface RouteLogService {

    /**
     * 查找所有路由日志
     *
     * @return 路有日志列表
     */
    Flux<RouteLog> findAll();

    /**
     * 创建路由日志
     *
     * @param routeLog 路由日志
     * @return 路由日志
     */
    Mono<RouteLog> create(RouteLog routeLog);

    /**
     * 删除路由日志
     *
     * @param ids 路由日志id
     * @return 被删除的路由日志
     */
    Flux<RouteLog> delete(String ids);

    /**
     * 查找路由日志分页数据
     *
     * @param request  request
     * @param routeLog routeLog
     * @return 路由日志分页数据
     */
    Flux<RouteLog> findPages(QueryRequest request, RouteLog routeLog);

    /**
     * 查找路由分页数据count
     *
     * @param routeLog routeLog
     * @return count
     */
    Mono<Long> findCount(RouteLog routeLog);
}
