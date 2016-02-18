var app = angular.module('myApp', []);
app.controller('myCtrl', function ($scope, $http) {
    $http.get("http://localhost:8081/examen/control?op=get&ob=colegio")
            .then(function (response) {

                $scope.resultado = response.data;

                $scope.cabeceradenombre = function (nombre) {
                    $scope.nombrecolegio = nombre;
                   // $scope.estudio = nombre.Estudios;
                };

                $scope.order = function (predicate) {                    
                    $scope.predicate = predicate;
                };

            });
});
