<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Toast Grid Page</title>
    <link rel="stylesheet" type="text/css" href="https://nhn.github.io/tui.grid/latest/dist/tui-grid.css" />
    <script src="https://code.jquery.com/jquery-1.11.3.js"></script>
    <script type="text/javascript" src="https://nhn.github.io/tui.grid/latest/dist/tui-grid.js"></script>
</head>
<body>
    <div id="grid"></div>

    <script>
        window.onload = function () {
            var grid = new tui.Grid({
                el: document.getElementById('grid'),
                //data: gridData,
                scrollX: false,
                scrollY: false,
                columns: [
                    {
                        header: 'Name',
                        name: 'name'
                    },
                    {
                        header: 'Artist',
                        name: 'artist'
                    },
                    {
                        header: 'Type',
                        name: 'type'
                    },
                    {
                        header: 'Release',
                        name: 'release'
                    },
                    {
                        header: 'Genre',
                        name: 'genre'
                    }
                ]
            });
            $.ajax({
                url : "ajax/toastDataList",
                method : "POST",
                dataType : "JSON",
                success : function (result) {
                    console.dir(result);
                    grid.resetData(result);
                }
            });
        };
    </script>
</body>
</html>
