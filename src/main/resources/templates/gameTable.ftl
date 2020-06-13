<#import "parts/common.ftl" as c>
<#import "parts/heroChoise.ftl" as hc>
<#import "parts/imagesPick.ftl" as ip>
<#import "parts/imagesBan.ftl" as ib>

<@c.page>
    <a class="btn btn-primary" data-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
        Add new match
    </a>
    <div class="collapse" id="collapseExample">
        <div class="form-group mt-3">
            <form method="post">
                <div class="form-group">
                    <input type="number" class="form-control" name="match_id"  placeholder="Match ID">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="match_day"  placeholder="Day">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="match_date" placeholder="Date">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="game_number"  placeholder="Game number">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="enemy"  placeholder="Enemy team">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" name="game_status"  placeholder="Game status">
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Match result:</label>
                    <select class="form-control" name="win">
                        <option>Won</option>
                        <option>Lost</option>
                    </select>
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Our turn:</label>
                    <select class="form-control" name="our_turn">
                        <option>First pick</option>
                        <option>Second pick</option>
                    </select>
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Enemy turn:</label>
                    <select class="form-control" name="enemy_turn">
                        <option>First pick</option>
                        <option>Second pick</option>
                    </select>
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Our side:</label>
                    <select class="form-control" name="our_side">
                        <option>Radiant</option>
                        <option>Dire</option>
                    </select>
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Enemy side:</label>
                    <select class="form-control" name="enemy_side">
                        <option>Radiant</option>
                        <option>Dire</option>
                    </select>
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Our ban:</label>
                <@hc.heroChoise "our_ban1" />
                <@hc.heroChoise "our_ban2" />
                <@hc.heroChoise "our_ban3" />
                <@hc.heroChoise "our_ban4" />
                <@hc.heroChoise "our_ban5" />
                <@hc.heroChoise "our_ban6" />
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Our pick:</label>
                <@hc.heroChoise "our_pick1" />
                <@hc.heroChoise "our_pick2" />
                <@hc.heroChoise "our_pick3" />
                <@hc.heroChoise "our_pick4" />
                <@hc.heroChoise "our_pick5" />
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Enemy ban:</label>
                <@hc.heroChoise "enemy_ban1" />
                <@hc.heroChoise "enemy_ban2" />
                <@hc.heroChoise "enemy_ban3" />
                <@hc.heroChoise "enemy_ban4" />
                <@hc.heroChoise "enemy_ban5" />
                <@hc.heroChoise "enemy_ban6" />
                </div>

                <div class="form-group">
                <label class="col-sm-5 col-form-label">Enemy pick:</label>
                <@hc.heroChoise "enemy_pick1" />
                <@hc.heroChoise "enemy_pick2" />
                <@hc.heroChoise "enemy_pick3" />
                <@hc.heroChoise "enemy_pick4" />
                <@hc.heroChoise "enemy_pick5" />
                </div>

                <input type="hidden" name="_csrf" value="${_csrf.token}" />
                <div class="form-group">
                <button type="submit" class="btn btn-primary">Add</button>
                </div>
            </form>
        </div>
    </div>

    <table id="selectedColumn" class="table_sort mt-3" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th><b>Date</b>
            </th>
            <th><b>Enemy</b>
            </th>
            <th><b>Game status</b>
            </th>
            <th><b>Win</b>
            </th>
            <th colspan="12"><b>Draft</b>
            </th>
            <th><b>Match ID</b>
            </th>
        </tr>
        </thead>
        <tbody>
        <#list matches as match>
        <tr>
            <td>
                <b>${match.match_day}</b>
                <div><span>${match.match_date}</span></div>
                <div><span>${match.game_number}</span></div>
            </td>
            <td>
                <span>${match.enemy}</span>
            </td>
            <td>
                <span>${match.game_status}</span>
            </td>
            <td class="${match.win}">
                <span>${match.win}</span>
            </td>
            <td colspan="4" class="picks ${match.our_side}">
                <div><span>${match.our_turn}</span></div>
                <div class="text-center">
                    <@ip.images match.our_pick1 />
                    <@ip.images match.our_pick2 />
                    <@ip.images match.our_pick3 />
                    <@ip.images match.our_pick4 />
                    <@ip.images match.our_pick5 />
                </div>
            </td>
            <td colspan="2" class="bans ${match.our_side}">
                <div><span>${match.our_side}</span></div>
                <div class="text-center">
                    <@ib.images match.our_ban1 />
                    <@ib.images match.our_ban2 />
                    <@ib.images match.our_ban3 />
                    <@ib.images match.our_ban4 />
                </div>
                <div class="text-center">
                    <@ib.images match.our_ban5 />
                </div>
                <div class="text-center">
                    <@ib.images match.our_ban6 />
                </div>
            </td>
            <td colspan="4" class="picks ${match.enemy_side}">
                <div><span>${match.enemy_turn}</span></div>
                <div class="text-center">
                    <@ip.images match.enemy_pick1 />
                    <@ip.images match.enemy_pick2 />
                    <@ip.images match.enemy_pick3 />
                    <@ip.images match.enemy_pick4 />
                    <@ip.images match.enemy_pick5 />
                </div>
            </td>
            <td colspan="2" class="bans ${match.enemy_side}">
                <div><span>${match.enemy_side}</span></div>
                <div class="text-center">
                    <@ib.images match.enemy_ban1 />
                    <@ib.images match.enemy_ban2 />
                    <@ib.images match.enemy_ban3 />
                    <@ib.images match.enemy_ban4 />
                </div>
                <div class="text-center">
                    <@ib.images match.enemy_ban5 />
                </div>
                <div class="text-center">
                    <@ib.images match.enemy_ban6 />
                </div>
            </td>
            <td>
                <b>${match.match_id}</b>
            </td>
        </tr>
        <#else>
            No matches
        </#list>
        </tbody>
</@c.page>
