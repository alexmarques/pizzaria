<!doctype html>
<html lang="en">
	<head>
		<meta charset="UTF-8" />
		<script src="js/jquery-2.1.4.min.js" type="text/javascript"></script>
		<script src="js/bootstrap.js" type="text/javascript"></script>
		<link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
	</head>
	<body>
		<div class="container container-fluid">
			<div class="row">
				<h3 class="center">Pizzaria-Online</h3>
			</div>
			<div class="row">
				<div class="col-sm-2">
					<ul class="nav navbar">
						<li>Bebidas</li>
						<li>Pizzas</li>
						<li>Sobremesas</li>
					</ul>
				</div>
				<div class="col-sm-8">
					<div class="row">
						<form class="form-horizontal" action="index.html">
							<div class="form-group">
								<h4 class="col-sm-offset-2 col-sm-10"><span class="label label-info">Dados para Entrega</span></h4>
							</div>
							<div class="form-group">
								<label for="nome" class="col-sm-2 control-label">Nome</label>
								<div class="col-sm-10">
									<input type="text" class="form-control" id="nome" placeholder="Nome">
								</div>
							</div>
							<div class="form-group">
								<label for="enderecoRua" class="col-sm-2 control-label">Endereço</label>
								<div class="col-sm-7">
									<input type="text" class="form-control" id="enderecoRua" placeholder="Rua/Avenida...">
								</div>
								<label for="enderecoNumero" class="col-sm-1 control-label">Número</label>
								<div class="col-sm-2">
									<input type="text" class="form-control" id="enderecoNumero" placeholder="Número">
								</div>
							</div>
							<div class="form-group">
								<label for="enderecoCep" class="col-sm-2 control-label">CEP</label>
								<div class="col-sm-2">
									<input type="text" class="form-control" id="enderecoCep" placeholder="CEP">
								</div>
								<label for="enderecoCidade" class="col-sm-1 control-label">Cidade</label>
								<div class="col-sm-3">
									<input type="text" class="form-control" id="enderecoCidade" placeholder="Cidade">
								</div>
								<label for="enderecoEstado" class="col-sm-1 control-label">Estado</label>
								<div class="col-sm-3">
									<input type="text" class="form-control" id="enderecoEstado" placeholder="Estado">
								</div>
							</div>
							<hr/>
							<div class="form-group">
								<h4 class="col-sm-offset-2 col-sm-10"><span class="label label-info">Forma de Pagamento</span></h4>
							</div>
							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-1">
									<input type="radio" class="radio radio-inline" name="tipoPagamento" id="pagamentoDinheiro">
								</div>
								<label for="pagamentoDinheiro" class="col-sm-9 control-label">Dinheiro</label>
							</div>
							<div class="form-group pull-right">
								<div class="col-sm-offset-2 col-sm-10">
									<button type="submit" class="btn btn-info">Enviar</button>
								</div>
							</div>
						</form>
					</div>
				</div>
				<div class="col-sm-2">
					<p>teste</p>
				</div>
			</div>
		</div>
	</body>
</html>