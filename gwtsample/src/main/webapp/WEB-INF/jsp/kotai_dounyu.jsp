<%@page pageEncoding="UTF-8"%>

<body>

<%@ include file="/WEB-INF/jsp/head_navi.jspf"%>


	<script type="text/javascript">
$(function(){
　$("#cal_test").datepicker();
});
</script>
	<script type="text/javascript">
$(function(){
　$("#cal_test2").datepicker();
});
</script>
	<script type="text/javascript">
$(function(){
　$("#cal_test3").datepicker();
});
</script>
	<script type="text/javascript">
$(function(){
　$("#cal_test4").datepicker();
});
</script>

	<div class="container">


		<form class="form-horizontal span6" action="kotai_dounyu" method="post">
			<input type="hidden" name="_event_proceed"/>
			<input type="hidden" name="name2" value=" "/>
			<fieldset>
				<legend>個体導入　${f:h(test)}</legend>


				<div class="control-group">
					<label class="control-label">系統名</label>
					<div class="controls">
						<div class="row-fluid">
							<div class="span12">
								<select class="input-block-level">
									<option></option>
									<option>日立</option>
									<option>ソリューションズ</option>
									<option>小野寺</option>
								</select>
							</div>
						</div>
					</div>
				</div>

				<div class="control-group">
					<label class="control-label">性別</label>
					<div class="controls">
						<div class="row-fluid">
							<div class="span12">
								<select class="input-block-level">
									<option></option>
									<option>Male</option>
									<option>Female</option>
								</select>
							</div>
						</div>
					</div>
				</div>


				<div class="control-group">
					<label class="control-label" for="username">出生日</label>
					<div class="controls">
						<input type="text" id="cal_test" name="cal_test" placeholder=""
							class="input-xlarge">
					</div>
				</div>

				<div class="control-group">
					<label class="control-label" for="username">導入日</label>
					<div class="controls">
						<input type="text" id="cal_test2" name="cal_test2" placeholder=""
							class="input-xlarge">
					</div>
				</div>

				<div class="control-group">
					<label class="control-label">導入匹数</label>
					<div class="controls">
						<div class="row-fluid">
							<div class="span4">
								<input type="text" id="hiki" class="input-block-level"
									autocomplete="off" title="匹" pattern="\d+" required>
							</div>
							<div class="span2">匹</div>
							<div class="span4">
								<input type="text" id="gage" class="input-block-level"
									autocomplete="off" title="ゲージ" pattern="\d+" required>
							</div>
							<div class="span2">ゲージ</div>
						</div>
					</div>
				</div>
				<div class="control-group">
					<label class="control-label">メモ</label>
					<div class="controls">
						<div class="row-fluid">
							<div class="span12">
								<input type="text" class="input-block-level" autocomplete="off"
									title="メモ">
							</div>
						</div>
					</div>
				</div>


				<div class="form-actions">
					<button type="submit" class="btn btn-primary">登録</button>
					<button type="button" class="btn">Clear</button>
				</div>
			</fieldset>
		</form>



		<form class="form-horizontal span6">
			<fieldset>
				<legend>導入履歴</legend>


				<div class="control-group">
					<label class="control-label">導入日</label>
					<div class="controls">
						<div class="row-fluid">
							<div class="span4">
								<input type="text" id="cal_test3" class="input-block-level"
									autocomplete="off" title="From">
							</div>
							<div class="span1">～</div>
							<div class="span4">
								<input type="text" id="cal_test4" class="input-block-level"
									autocomplete="off" title="To">
							</div>
							<div class="span2">
								<button type="submit" class="btn btn-primary">検索</button>
							</div>
						</div>
					</div>
				</div>
			</fieldset>
		</form>




		<!-- 検索結果部分 -->


		<div class="well">
			<table class="table">
				<thead>
					<tr>
						<th>#</th>
						<th>カード番号</th>
						<th>ケージ番号</th>
						<th>Litter番号</th>
						<th>性別</th>
						<th>導入数</th>
						<th>系統</th>
						<th>出生日</th>
						<th>導入日</th>
						<th>印刷済み</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<td>1</td>
						<td>112233</td>
						<td>128481</td>
						<td>25975</td>
						<td>Male</td>
						<td>3</td>
						<td>129Jcl</td>
						<td>1999-04-01</td>
						<td>1999-04-30</td>
						<td></td>
					</tr>
					<tr>
						<td>2</td>
						<td>112234</td>
						<td>128482</td>
						<td>25976</td>
						<td>Male</td>
						<td>3</td>
						<td>129Jcl</td>
						<td>1999-04-01</td>
						<td>1999-04-30</td>
						<td></td>
					</tr>
					<tr>
						<td>3</td>
						<td>112234</td>
						<td>128482</td>
						<td>25976</td>
						<td>Male</td>
						<td>3</td>
						<td>129Jcl</td>
						<td>1999-04-01</td>
						<td>1999-04-30</td>
						<td></td>
					</tr>
					<tr>
						<td>4</td>
						<td>112234</td>
						<td>128482</td>
						<td>25976</td>
						<td>Male</td>
						<td>3</td>
						<td>129Jcl</td>
						<td>1999-04-01</td>
						<td>1999-04-30</td>
						<td></td>
					</tr>
					<tr>
						<td>5</td>
						<td>112234</td>
						<td>128482</td>
						<td>25976</td>
						<td>Male</td>
						<td>3</td>
						<td>129Jcl</td>
						<td>1999-04-01</td>
						<td>1999-04-30</td>
						<td></td>
					</tr>
				</tbody>
			</table>
		</div>
		<div class="pagination">
			<ul>
				<li><a href="#">Prev</a></li>
				<li><a href="#">1</a></li>
				<li><a href="#">2</a></li>
				<li><a href="#">3</a></li>
				<li><a href="#">4</a></li>
				<li><a href="#">Next</a></li>
			</ul>
		</div>

		<div class="form-actions">
			<button type="button" class="btn btn-primary">印刷</button>
			<button type="button" class="btn btn-primary">印刷＆保存</button>
			<button type="button" class="btn btn-success">削除</button>
		</div>


		<div class="modal small hide fade" id="myModal" tabindex="-1"
			role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">×</button>
				<h3 id="myModalLabel">Delete Confirmation</h3>
			</div>
			<div class="modal-body">
				<p class="error-text">Are you sure you want to delete the user?</p>
			</div>
			<div class="modal-footer">
				<button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
				<button class="btn btn-danger" data-dismiss="modal">Delete</button>
			</div>
		</div>
	</div>
	<!-- /container -->

</body>
</html>
