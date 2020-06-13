<#import "parts/common.ftl" as c>

<@c.page>
    <table id="selectedColumn" class="table_sort mt-3" cellspacing="0" width="100%">
        <thead>
        <tr>
            <th class="th-i">Hero
            </th>
            <th class="th-i">G
            </th>
            <th class="wins">W
            </th>
            <th class="losses">L
            </th>
            <th class="th-i">WR%
            </th>
            <th class="th-i"><b>R</b>
            </th>
        </tr>
        </thead>
        <tbody>
        <#list heroWRS as hwrs>
        <tr>
            <td>
                ${hwrs.heroname}
            </td>
            <td>
                ${hwrs.hero_games}
            </td>
            <td>
                ${hwrs.hero_wins}
            </td>
            <td>
                ${hwrs.hero_losses}
            </td>
            <td>
                ${hwrs.hero_wrs}%
            </td>
            <td>
                <b>${hwrs.hero_rate}%</b>
            </td>
        </tr>
        <#else>
            No heroes statistic
        </#list>
        </tbody>
    </table>
</@c.page>