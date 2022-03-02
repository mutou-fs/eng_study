<template>
  <div class="head-box">
    <div class="title">学习进度:</div>
    <Progress :percent="72" :stroke-width="20" text-inside />
  </div>
</template>

<script>
export default {
  name: 'MyHeader',
  components: {
    // IconHomeFilled
  }
}

</script>

<style>
.head-box {
  height: 100%;
  width: 100%;
  /*position: relative;*/
}

.title {
  display: inline-block;
  height: 20px;
  width: 70px;
  margin-top: 20px;
  /*position: absolute;*/
  /*left: 200px;*/
}

.ivu-progress {
  display: inline-block !important;
  width: 50% !important;
  height: 20px;
  text-align: center;
}
/* 进度条背景颜色 */
.ivu-progress-bg{

}
/* 进度条百分比文字 */
.ivu-progress-inner-text{
  padding-right: 10px!important;
}

</style>
